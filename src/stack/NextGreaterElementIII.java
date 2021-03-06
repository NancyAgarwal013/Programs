package stack;

public class NextGreaterElementIII {

    public static void main(String[] args) {
        System.out.println(nextGreaterElement(125431));
    }
    // O(n), when n is the no of digits in n
    public static int nextGreaterElement(int n) {
        char[] str = (n+"").toCharArray();

        int deflectionPoint = str.length-1;

        while(deflectionPoint>0){
            if(str[deflectionPoint] > str[deflectionPoint-1]) {
                break;
            }
            deflectionPoint--;
        }
        if(deflectionPoint == 0){
            return -1;
        }

        int firstSwappingIndex = deflectionPoint -1;

        int secondSwappingIndex = str.length -1;
        while(secondSwappingIndex>=firstSwappingIndex){
            if(str[firstSwappingIndex] < str[secondSwappingIndex]) {
                break;
            }
            secondSwappingIndex--;
        }

        // swap

        char temp = str[firstSwappingIndex];
        str[firstSwappingIndex] = str[secondSwappingIndex];
        str[secondSwappingIndex] = temp;

        // swapping at the point of deflection

        reverseChar(str, deflectionPoint);
        Long no = Long.parseLong(new String(str));
        if(no<=Integer.MAX_VALUE){
            return no.intValue();
        } else{
            return -1;
        }

    }

    private static void reverseChar(char[] str, int i){
        int start = i;
        int end =str.length-1;
        while(end>=start){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            end--;
            start++;

        }
    }


}

