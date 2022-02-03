public class SchoolStd{
    private String stdName;
    private long phNo;
    private String addr;
    private String sonOf;

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSonOf() {
        return this.sonOf;
    }

    public void setSonOf(String sonOf) {
        this.sonOf = sonOf;
    }

    public String getStdName() {
        return stdName;
    }
    public void setStdName(String stdName) {
        this.stdName = stdName;
    }
    public long getPhNo() {
        return phNo;
    }
    public void setPhNo(long phNo) {
        this.phNo = phNo;
    }
   
    public void logic(){
        System.out.println("\nlogic will update");
        System.out.println(this.stdName+"\n"+this.sonOf+"\n"+this.phNo+"\n"+this.addr);

    }
}


