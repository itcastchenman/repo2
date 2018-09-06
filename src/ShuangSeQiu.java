public class Shuangseqiu {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rm=new Random();
        int num=1;
        while (true){
            if (num>6){
                break;
            }
            int i = rm.nextInt(33)+1;
            if (!list.contains(i)){
                list.add(i);
            }
            num++;
        }
        list.add(rm.nextInt(16)+1);
        System.out.println(list);
    }
}


31  32  28  19  16  4  14