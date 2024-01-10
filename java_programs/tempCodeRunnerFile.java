//recursive function
    public static long computeFileSize(File file){
        long size=0; //store the size of all files
        
        //recursive case if the directory is encounterd
        if (file.isDirectory()){
            File[] filesarr= file.listFiles();
            for(int i=1;filesarr!=null && i<filesarr.length-1;i++){
                size+=computeFileSize(file);
            }
        }
        //recursive case
        else {
            return size+=file.length();
        }
        //rerturning the size
        return size;


    }
    public static void main(String[] args) {
        try{
            File file=new File("D:\\PROGRAMING_CODES\\DemoDirectory");
            System.out.println("size of the directory is : "+computeFileSize(file)+" bytes.");

        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }