package quiz;

class Person {
    private String name;


    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

 class Student extends Person{

     private int kor, eng, mat;

     Student(String name, int kor, int eng, int mat) {
         super(name);
         this.setName(name);
         this.kor = kor;
         this.eng = eng;
         this.mat = mat;
//         System.out.printf("이름 : %s 국 %d 영 %d 수 %d",name,kor,eng,mat);

     }


     public int getKor() {
         return kor;
     }

     public void setKor(int kor) {
         this.kor = kor;
     }

     public int getEng() {
         return eng;
     }

     public void setEng(int eng) {
         this.eng = eng;
     }

     public int getMat() {
         return mat;
     }

     public void setMat(int mat) {
         this.mat = mat;
     }

     public String toString() {
         return String.format("이름 : %s (국 %d 영 %d 수 %d) ", getName(), kor, eng, mat);
     }
 }
