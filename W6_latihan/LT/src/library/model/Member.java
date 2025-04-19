package library.model;

public class Member 
{
    public String name;
    public String memberId;

    public Member(String name, String memberId) 
    {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() 
    {
        return name;
    }

    public String getMemberId() 
    {
        return memberId;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setMemberId(String memberId)
    {
        this.memberId = memberId;
    }
}
