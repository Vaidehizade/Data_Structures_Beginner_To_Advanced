package Bit_Manipulation;
//Replace bits in N by M
// yOU ARE GIVEN TWO 32 BIT NUMBERS , N and M, and two bit positions i and j
//Write a method to set all bits between i and j in N equal to M.
//M (becomes a substring of N locationed at and starting at j)
public class Replace_bits {
    public static void main(String[] args) {
        int N = 15;
        int M = 2;
        int i = 2, j=6;
        //Output :  1001010100;

        clearBitsInRange(N,i,j);
        int mask  = (M << i);
        N = N | mask;
        System.out.println(N);
    }
}
