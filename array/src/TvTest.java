class Tv{
    String color;
    boolean power;
    int channel;

    void power(){power=!power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}

class TvSet{
    public static void main(String[] args){
        Tv t;
        t=new Tv();
        t.channel=7;
        t.channelDown();
        System.out.println("현재 채널 : "+t.channel);
    }
}