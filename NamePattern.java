import java.util.Scanner;
class NamePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter your name: ");
        String name = sc.next().toUpperCase();    
        System.out.print("Enter the size (odd number recommended): ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (char letter : name.toCharArray()) {
                printLetter(letter, n, i);
                System.out.print("   ");
            }
            System.out.println();
        }
    }
    public static void printLetter(char letter, int n, int i) { 
        switch (letter) {
            case 'A': printA(n, i); break;
            case 'B': printB(n, i); break;
            case 'C': printC(n, i); break;
            case 'D': printD(n, i); break;
            case 'E': printE(n, i); break;
            case 'F': printF(n, i); break;
            case 'G': printG(n, i); break;
            case 'H': printH(n, i); break;
            case 'I': printI(n, i); break;
            case 'J': printJ(n, i); break;
            case 'K': printK(n, i); break;
            case 'L': printL(n, i); break;
            case 'M': printM(n, i); break;
            case 'N': printN(n, i); break;
            case 'O': printO(n, i); break;
            case 'P': printP(n, i); break;
            case 'Q': printQ(n, i); break;
            case 'R': printR(n, i); break;
            case 'S': printS(n, i); break;
            case 'T': printT(n, i); break;
            case 'U': printU(n, i); break;
            case 'V': printV(n, i); break;
            case 'W': printW(n, i); break;
            case 'X': printX(n, i); break;
            case 'Y': printY(n, i); break;
            case 'Z': printZ(n, i); break;
            default: printSpace(n); break;
        }
    }

    public static void printA(int n, int i) {
        for (int j = 1; j <= n; j++) {
            if (i == 1 || j == 1 || j == n || i == n / 2 + 1)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }

    public static void printB(int n, int i) {
        for (int j = 1; j <= n; j++) {
            if (j == 1 || (i == 1 && j != n) || (i == n / 2 + 1 && j != n) || (i == n && j != n) || j == n && i != 1 && i != n / 2 + 1 && i != n)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }

    public static void printC(int n, int i) {
        for (int j = 1; j <= n; j++) {
            if (i == 1 || i == n || j == 1)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }

    public static void printD(int n, int i) {
        for (int j = 1; j <= n; j++) {
            if (j == 1 || (i == 1 && j != n) || (i == n && j != n) || j == n && i != 1 && i != n)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }

    public static void printE(int n, int i) {
        int mid=n/2 +1;
        for (int j = 1; j <= n; j++) {
            if (i == 1 || i == mid || i == n || j == 1)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printF(int n, int i) {
        int mid=n/2 +1;
        for (int j = 1; j <= n; j++) {
            if (i == 1 || i == mid || j == 1)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printG(int n, int i) {
        int mid=n/2 +1;
        for (int j = 1; j <= n; j++) {
            if (i == 1 || j == 1 || i==n || i>=mid && j==n || i==mid && j>=mid)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }

    public static void printH(int n, int i) {
        int mid=n/2 +1;
        for (int j = 1; j <= n; j++) {
            if (j == 1 || j == n || i == mid)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }

    public static void printI(int n, int i) {
        int mid=n/2 +1;
        for (int j = 1; j <= n; j++) {
            if (i == 1 || i == n || j == mid)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printJ(int n, int i) {
        int mid=n/2 +1;
        for (int j = 1; j <= n; j++) {
            if (i==1 || j<=mid && i==n ||j==mid || i>=mid && j==1)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printK(int n, int i) {
        int mid=n/2 +1;
        for (int j = 1; j <= n; j++) {
            if (j == 1 || i+j==n+1 && i<=mid || i==j && i>=mid )
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printL(int n, int i) {
        for (int j = 1; j <= n; j++) {
            if (i==n || j==1 )
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printM(int n, int i) {
        for (int j = 1; j <= n; j++) {
            if (j == 1 || j == n || (i == j && j <= n / 2 + 1) || (i + j == n + 1 && j > n / 2))
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }

    public static void printN(int n, int i) {
        for (int j = 1; j <= n; j++) {
            if (j == 1 || j == n || i == j)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }

    public static void printO(int n, int i) {
        for (int j = 1; j <= n; j++) {
            if (i == 1 || i == n || j == 1 || j == n)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printP(int n, int i) {
        int mid=n/2 +1;
        for (int j = 1; j <= n; j++) {
            if (j==1 || i==1 || i==mid || j==n && i<=mid)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printQ(int n, int i) {
        int mid=n/2 +1;
        for (int j = 1; j <= n; j++) {
            if (j==1 && i!=n || i==1 && j!=n || i==n-1 && j!=n || j==n-1 && i!=n || i>=mid && i==j)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printR(int n, int i) {
        int mid=n/2 +1;
        for (int j = 1; j <= n; j++) {
            if (j == 1 ||i==1 || i==mid || i<=mid && j==n || i==j && i>=mid)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printS(int n, int i) {
        int mid=n/2 +1;
        for (int j = 1; j <= n; j++) {
            if (i==1 || i==n || j==1 && i<=mid || i==mid || j==n && i>=mid)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printT(int n, int i) {
        int mid=n/2 +1;
        for (int j = 1; j <= n; j++) {
            if  (i==1 || j==mid )
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printU(int n, int i) {
        for (int j = 1; j <= n; j++) {
            if (i==n || j==1 || j==n)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printV(int n, int i) {
      int p=1,q=n;
        for (int j = 1; j <= n; j++) {
            if (j==p || j==q)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
         p++;
        q--;
    }
    public static void printW(int n, int i) {
        // int mid=n/2 +1;
        for (int j = 1; j <= n; j++) {
            if (j == 1 || j == n || (i == j && i >= n / 2) || (i + j == n + 1 && i >= n / 2))
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printX(int n, int i) {
        for (int j = 1; j <= n; j++) {
            if (i==j || i+j==n+1)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printY(int n, int i) {
       
        int p=1,q=n;
        for (int j = 1; j <= q; j++) {
            if (j==p || j==q)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
        p++;
        q--;
    }
    public static void printZ(int n, int i) {
       
        for (int j = 1; j <= n; j++) {
            if (i+j==n+1 || i==1 || i==n)
                System.out.print("* ");
            else
                System.out.print("  ");
        }
    }
    public static void printSpace(int n) {
        for (int j = 1; j <= n; j++) {
            System.out.print("  ");
        }
    }
}
