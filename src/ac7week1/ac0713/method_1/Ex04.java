package ac7week1.ac0713.method_1;

public class Ex04 {

    static void func1(int n,int[]array) {
        n++;
        array[0]++;
    }

    public static void main(String[] args) {
        // 일반 타입은 복사(=)시 실제 데이터가 복사되고
        // 일반 타입은 값이 복사가 되어 실제 값이 변경되지가 않는다
        // 참조 타입은 복사시 가리키는 방향이 같아진다.
        // 참조 타입은 가리키는 대상이 같아져 값을 변경이 가능

        int n = 10;
        int[] arr = new int[]{10};

        func1(n,arr);
        System.out.println(n);
        System.out.println(arr[0]);




    }
}
