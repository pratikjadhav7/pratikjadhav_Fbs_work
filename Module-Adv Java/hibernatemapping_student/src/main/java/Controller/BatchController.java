package Controller;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import DTO.BatchDTO;
import DTO.ResponseDTO;
import Model.Student;
import Service.BatchService;
import Service.StudentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/batchapi/*")
public class BatchController extends HttpServlet {

	ObjectMapper mapper;
	BatchService batchService = new BatchService();
	StudentService studentService = new StudentService();

	@Override
	public void init() throws ServletException {
		mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		setCORS(resp);
		String path = req.getPathInfo();

		if ("/displayallbatches".equals(path)) {
			displayAllBatches(req, resp);
		}
		else if("/getallstudents".equals(path)) {
			getAllStudents(req,resp);
		}

	}

	private void setCORS(HttpServletResponse resp) {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		setCORS(resp);
		String path = req.getPathInfo();

		if ("/addstudent".equals(path)) {
			addStudent(req, resp);
		}
		
	}

	private void getAllStudents(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/json");
		
		List<Student> list=studentService.getAllStudents();
		
		String response = mapper.writeValueAsString(list);
		
		resp.getWriter().print(response);
		
	}

	private void addStudent(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String studentInfo = req.getReader().readLine();

		Student student = mapper.readValue(studentInfo, Student.class);

		studentService.addStudent(student);
		
		   ResponseDTO dto = new ResponseDTO(200, "Student Added Successfully");

		    resp.setContentType("application/json");

		    mapper.writeValue(resp.getWriter(), dto);

	}

	private void displayAllBatches(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("application/json");
		List<BatchDTO> list = batchService.getBatchDetails();

		String listString = mapper.writeValueAsString(list);

		resp.getWriter().print(listString);

	}
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setCORS(resp);
	}
	


}
