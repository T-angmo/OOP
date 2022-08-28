
import java.util.*;

public class Lab03_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        String s1 = input.nextLine();
        System.out.print("Enter list2: ");
        String s2 = input.nextLine();

        int list1[] = stringtoarray(s1);
        int list2[] = stringtoarray(s2);
        int ans[] = merge(list1, list2);
        Arrays.sort(ans);
        ansprint(ans);

    }

    public static void ansprint(int ans[]) {
        System.out.print("The merged list is");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(" " + ans[i]);
        }
    }

    public static int[] merge(int list1[], int list2[]) {
        int ansarr[] = new int[list1.length + list2.length];
        int j1 = 0;
        int j2 = 0;
        for (int i = 0; i < ansarr.length; i++) {
            if (i < list1.length) {
                ansarr[i] = list1[j1++];
            } else if (i >= list1.length) {
                ansarr[i] = list2[j2++];
            }

        }
        return ansarr;
    }

    public static int[] stringtoarray(String num) {
        boolean m = false;
        List<Integer> list = new ArrayList<Integer>();
        do {
            m = false;
            for (int i = 0; i < num.length() - 1; i++) {
                if ((num.substring(i, i + 1)).equals(" ")) {
                    list.add(Integer.parseInt((num.substring(0, i))));
                    num = num.substring(i + 1);
                    m = true;
                    break;
                }
            }
            if (m == false) {
                list.add(Integer.parseInt(num));
            }
        } while (m);
        int ansarr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ansarr[i] = list.get(i);
        }
        return ansarr;
    }
}