package JavaTraining.src.Day3;

public class Conditional {//print even
    public static void main(String[] args) {
int a[]= {2,4,6};
int b[]= {10,12,13,4,5,6};
boolean flag=false;
for(int i=0;i<a.length;i++){
if(a[i]%2==0)
{
    System.out.println("even"+a[i]);
    }
    for(int v=0;v<b.length;v++){
if(b[i]%2 == 1)
{
    System.out.println("odd"+b[i]);
    flag =true;
}}
if(!flag) {
    System.out.println("No odd numbers");
}
}}}
