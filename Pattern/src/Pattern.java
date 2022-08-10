class Pattern {
    public static void main(String[] args) {
  
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 2 || i == 4 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 5; j++) {
                if (((j == 0 || j == 4) && i != 4) || ((j == 1 || j == 2 || j == 3) && (i == 4)))

                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                if (j == 0 || ((i == 0 || i == 2) && j != 4) || (j == 4 && (i != 0 && i != 2))) {

                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                if (((j == 0 || j == 4) && (i != 0 && i != 4)) || ((j == 1 || j == 2 || j == 3) && (i == 0 || i == 4)))

                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            for (int space = 0; space < 3; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }

            System.out.println(" ");
        }

    }
}

