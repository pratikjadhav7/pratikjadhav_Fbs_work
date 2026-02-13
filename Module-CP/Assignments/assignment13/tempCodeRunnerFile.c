
    printf("Enter Size Of Array:");
    scanf("%d",&s);
    int*arr=(int*)malloc(sizeof(int)*s);
    printf("Enter elements in Array:");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    printf("\nArray:");
    for(int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    printf("\nSum of Elements of Array:");
    for(int i=0;i<s;i++){
        int sum=0;
        sum+=arr[i];