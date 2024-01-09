package codingTestPractice.datastructure.array;

import java.util.Arrays;

public class Array_pr {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 4};
        int[] newArr1 = Arrays.copyOf(arr1, 3);
        int[] newArr2 = Arrays.copyOfRange(arr1, 1, 4);

        System.out.println(Arrays.toString(newArr1));//[1, 2, 3]
        System.out.println(Arrays.toString(newArr2));//[2, 3, 4]

        //배열 오름차순 정렬
        Arrays.sort(arr1);

        //배열 내림차순 정렬
        Integer[] arr2 = Arrays.stream(arr1)
                                .boxed()
                                .toArray(Integer[]::new);


        Arrays.sort(arr2, (o1, o2) -> o2.compareTo(o1));
        // Arrays.sort(arr2, new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer o1, Integer o2) {
        //         return o2.compareTo(o1);
        //     }
        // });
        System.out.println(Arrays.toString(arr2)); //[4, 3, 2, 1]

        //일차원 배열 출
        System.out.println(Arrays.toString(arr1));//[1, 2, 3, 4]

        int [][] arr3=new int[][]{{1,2},{3,4}};

        //다차원 배열 출력
        System.out.println(Arrays.deepToString(arr3));//[[1, 2], [3, 4]]
    }
}
