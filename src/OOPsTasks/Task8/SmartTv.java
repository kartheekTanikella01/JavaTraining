package OOPsTasks.Task8;

public class SmartTv extends Appliance implements Connectivity {

    @Override
    public void connect() {
        System.out.println("Appliance has been connected to smarttv");
    }

    public static void main(String[] args) {
        SmartTv st=new SmartTv();
        st.turnon();
        st.connect();
    }

}
