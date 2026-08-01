window.onload = function () {
    loadBatches();
};

function loadBatches(){

    fetch("http://localhost:8080/hibernatemappingg/batchapi/displayallbatch")

    .then(response=>response.json())

    .then(data=>{

        let batches=data.data;

        let select=document.getElementById("batch");

        for(let i=0;i<batches.length;i++){

            let option=document.createElement("option");

            option.value=batches[i].batchId;

            option.text=
                batches[i].batchName+
                " ("+
                batches[i].batchId+
                ")";

            select.appendChild(option);
        }

    });

}

function saveStudent(){

        alert("Button Clicked");

    // ya
    console.log("Button Clicked");
    
    const student={

        frn:document.getElementById("frn").value,

        name:document.getElementById("name").value,

        address:{
            houseno:document.getElementById("houseno").value,
            laneno:document.getElementById("laneno").value,
            city:document.getElementById("city").value,
            state:document.getElementById("state").value,
            pincode:document.getElementById("pincode").value
        },

        batch:{
            batchId:document.getElementById("batch").value
        }

    };

    fetch("http://localhost:8080/hibernatemappingg/batchapi/addstudent",{

        method:"POST",

        headers:{
            "Content-Type":"application/json"
        },

        body:JSON.stringify(student)

    })

    .then(response=>response.json())

    .then(data=>{
        alert(data.message);
    });

}