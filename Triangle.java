class Triangle{
    public static void main(String[]args){
        int x = 1;
        boolean flag = true;
        int count = 0;
        int n = 1;

        while (flag){
            n++;
            for(int i=1; i<=x; i++){
                if(x%i==0){
                    count++;
                }
            }
            if(count>500){
                flag = false;
            }else{
                flag = true;
                x = x+n;
            }
            count = 0;
        }
        System.out.println(x);
    }
}