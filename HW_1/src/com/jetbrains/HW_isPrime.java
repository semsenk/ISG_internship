package com.jetbrains;

class Main {

         public static boolean isPrime(int check_num) {
                    boolean prime = false;
                    for(int i = 2; i < check_num; i++) {
                        if(check_num % i == 0) {
                            break;
                        }
                        else {
                            prime = true;
                        }
                    }
                    return prime;
         }

        public static void main(String[] args) {
    	    for(int i = 2; i <= 100; i++) {
                if(isPrime(i)) {
                    System.out.println(i);
                }
            }
        }

}
