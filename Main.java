import java.util.Scanner;

class Student
{
  String name;
  int age;
  int[] marks;

  Student(String name,int age,int[] marks)
  {
    this.name=name;
    this.age=age;
    this.marks=marks;
  }

  int sum=0;
  int passed=0;

  float calculateAvg()
  {
    for (int i=0;i<marks.length;i++)
    {
      sum+=marks[i];
    }
    int avg=(sum/marks.length);
    return avg;
  }

  int findLargest()
  {
    int largest=marks[0];

    for (int i=0;i<marks.length;i++)
    {
      if(marks[i] > largest)
      {
        largest = marks[i];
      }
    }
    return largest;
  }

  int findSmallest()
  {
    int smallest = marks[0];

    for (int i=0;i<marks.length;i++)
    {
      if (marks[i] < smallest)
      {
        smallest= marks[i];
      }
    }
    return smallest;
  }

  void countPasses()
  {
    for (int i=0;i<marks.length;i++)
    {
      if (marks[i] >= 50)
      {
        passed++;
      }
    }
    System.out.println("Passed subjects: "+passed);
  }

  void displatStudentInfo()
  {
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(sum);
    System.out.println(calculateAvg());
    System.out.println(findSmallest());
    System.out.println(findLargest());
    System.out.println(passed);
  }

  boolean haspassed()
  {
    boolean haspassed = false;
    if (calculateAvg()>=50)
    {
      haspassed =true;
    }
    return haspassed;
  }

}

public class Main
{
  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter Student name: ");
    String name=input.nextLine();

    System.out.println("Enter Student age: ");
    int age=input.nextInt();
    input.nextLine();

    int[] marks = new int[5];

    for (int i=0;i<5;i++)
    {
      System.out.println("Enter marks for Subject "+(i+1));
      marks[i]=input.nextInt();
    }

    Student s1 = new Student(name, age, marks);

    s1.displatStudentInfo();


  }
}