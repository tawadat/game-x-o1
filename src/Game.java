import java.util.Scanner;

public class Game {
    public static void main(String args[]) {
        String a[][] = {{"_", "_", "_"}, {"_", "_", "_"}, {"_", "_", "_"}};
        for (int count = 0; count < 9; count++) {
            Scanner inputx = new Scanner(System.in);
            Scanner inputy = new Scanner(System.in);
            System.out.println("\nВведите значение от 0 до 2 (координата строки)");
            int stroka = inputx.nextInt();      // считать адрес по строкам
            System.out.println("Введите значение от 0 до 2 (координата столбца)");
            int stolbik = inputy.nextInt();     //считать адрес по столбцам

           if (count % 2 ==0)
           {
               a[stroka][stolbik] = "x";
               System.out.println("Игрок1 сделал ход");
           }
           else
           {
               a[stroka][stolbik] = "o";
               System.out.println("Игрок2 сделал ход");
           }
            for (int count2 = 0; count2 < 3; count2++) {
                System.out.println("\n");
                for (int count3 = 0; count3 < 3; count3++) {
                    System.out.print(a[count2][count3] +"\t");
                }
            }
        if(a[0][0]=="x" && a[0][1]=="x" && a[0][2]=="x") {
            //if (a[0][1]=="x") {
              //  if(a[0][1]=="x") {
                    System.out.println("Игрок1 победил");
                    return;
                //}
           // }
        }
            if(a[1][0]=="x") {
                if (a[1][1]=="x") {
                    if(a[1][2] =="x") {
                        System.out.println("Игрок1 победил");
                        return;
                    }
                }
            }
            if(a[2][0]=="x") {
                if (a[2][1]=="x") {
                    if(a[2][2] =="x") {
                        System.out.println("Игрок1 победил");
                        return;
                    }
                }
            }
            if(a[0][0]=="x") {
                if (a[1][0]=="x") {
                    if(a[2][0] =="x") {
                        System.out.println("Игрок1 победил");
                        return;
                    }
                }
            }
            if(a[0][1]=="x") {
                if (a[1][1]=="x") {
                    if(a[1][2] =="x") {
                        System.out.println("Игрок1 победил");
                        return;
                    }
                }
            }
            if(a[2][0]=="x") {
                if (a[2][1]=="x") {
                    if(a[2][2] =="x") {
                        System.out.println("Игрок1 победил");
                        return;
                    }
                }
            }
            if(a[0][0]=="x") {
                if (a[1][1]=="x") {
                    if(a[2][2] =="x") {
                        System.out.println("Игрок1 победил");
                        return;
                    }
                }
            }
            if(a[2][0]=="x") {
                if (a[2][1]=="x") {
                    if(a[2][2] =="x") {
                        System.out.println("Игрок1 победил");
                        return;
                    }
                }
            } //игрок1

            if(a[0][0]=="o") {
                if (a[0][1]=="o") {
                    if(a[0][2] =="o") {
                        System.out.println("Игрок2 победил");
                        return;
                    }
                }
            }
            if(a[1][0]=="o") {
                if (a[1][1]=="o") {
                    if(a[1][2] =="o") {
                        System.out.println("Игрок2 победил");
                        return;
                    }
                }
            }
            if(a[2][0]=="y") {
                if (a[2][1]=="y") {
                    if(a[2][2] =="y") {
                        System.out.println("Игрок2 победил");
                        return;
                    }
                }
            }
            if(a[0][0]=="o") {
                if (a[1][0]=="o") {
                    if(a[2][0] =="o") {
                        System.out.println("Игрок2 победил");
                        return;
                    }
                }
            }
            if(a[0][1]=="o") {
                if (a[1][1]=="o") {
                    if(a[1][2] =="o") {
                        System.out.println("Игрок2 победил");
                        return;
                    }
                }
            }
            if(a[2][0]=="o") {
                if (a[2][1]=="o") {
                    if(a[2][2] =="o") {
                        System.out.println("Игрок2 победил");
                        return;
                    }
                }
            }
            if(a[0][0]=="o") {
                if (a[1][1]=="o") {
                    if(a[2][2] =="o") {
                        System.out.println("Игрок2 победил");
                        return;
                    }
                }
            }
            if(a[2][0]=="o") {
                if (a[2][1]=="o") {
                    if(a[2][2] =="o") {
                        System.out.println("Игрок2 победил");
                        return;
                    }
                }
            }
        }
    }
}
