class assignment3 {

	public static void main(String agrs[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }	
    }
}