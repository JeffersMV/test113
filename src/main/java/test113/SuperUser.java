package test113;

public class SuperUser {
    private NormalUser normalUser;
    private TempUser tempUser;

    public SuperUser(){
        System.out.println("Super User Created ->"+this);
    }


    public void setNormalUserProperty(NormalUser normalUser) {
        System.out.println("Setting Normal User ->"+normalUser);
        this.normalUser = normalUser;
    }

    public void setTempUserProperty(TempUser tempUser) {
        System.out.println("Setting Temp User ->"+tempUser);
        this.tempUser = tempUser;
    }
}
