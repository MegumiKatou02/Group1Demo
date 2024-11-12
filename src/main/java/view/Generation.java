package view;

import java.util.ArrayList;

public class Generation {
    private ArrayList<Member> members = new ArrayList<>();
    private String nameGroup;

    public Generation() {
        members.add(new Member("Lê Đình Chinh"));
        members.add(new Member("Lê Công Huy"));
        members.add(new Member("Nguyễn Duy Vũ"));
        members.add(new Member("Nguyễn Nhật Linh"));
        nameGroup = "Group 2";
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public String getNameGroup() {
        return nameGroup;
    }
}