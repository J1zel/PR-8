import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        WaitList l1 = new BoundedWaitList(5);
        l1.add(1);
        l1.add(3);
        l1.add(7);
        l1.add(14);
        l1.add(2432);
        System.out.print("Correct List:"+l1.content+"\n");
        WaitList l2 = new BoundedWaitList(3);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        System.out.print("Uncorrect List(unc. capacity):"+l2.content+"\n");
        WaitList l3 = new UnfairWaitList();
        l3.content.add(11);
        l3.content.add(22);
        l3.content.add(33);
        System.out.print("List without removes elements:"+l3.content+"\n");
        l3.content.remove(22);
        l3.content.remove(33);
        System.out.print("List with removes elements:"+l3.content+"\n");
        WaitList l4 = new WaitList();
        l4.content.add(1);
        l4.content.add(1234);
        l4.content.add(12345);
        l4.content.add(123456);
        l4.content.add(1234567);
        System.out.print("Current List:"+l4.content+"\n");
        l4.content.remove(1234);
        System.out.print("Current List:"+l4.content+"\n");
        System.out.print("List Contains:"+l4.content.contains(12345)+"\n");
        List l5 = new ArrayList();
        l5.add(1);
        l5.add(2);
        l5.add(3);
        l5.add(4);
        System.out.print("List Contains all:"+l4.content.containsAll(l5)+"\n");
        System.out.print("List is empty:"+l4.content.isEmpty()+"\n");

    }
}