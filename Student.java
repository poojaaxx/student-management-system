public class Student {
   int id;
   String name;
   int age;

   Student(int var1, String var2, int var3) {
      this.id = var1;
      this.name = var2;
      this.age = var3;
   }

   public String toString() {
      return "ID: " + this.id + "Name: " + this.name + "Age: " + this.age;
   }
}
