void main() {

    int[] aliceSizes = {1,1,2};
    int[] bobSizes = {2,2};

    LinkedList<Integer> arra = new LinkedList<>();
    LinkedList<Integer> arrb = new LinkedList<>();

    for (int num : aliceSizes) {
        arra.add(num);
    }

    for (int num : bobSizes) {
        arrb.add(num);
    }

    int suma = 0;
    int sumb = 0;

    for (int num : arra) {
        suma += num;
    }

    for (int num : arrb) {
        sumb += num;
    }

    for (int i = 0; i < aliceSizes.length; i++) {

        for (int j = 0; j < bobSizes.length; j++) {

            if (
                suma - arra.get(i) + arrb.get(j)
                ==
                sumb - arrb.get(j) + arra.get(i)
            ) {

                int[] answer = {
                    arra.get(i),
                    arrb.get(j)
                };

                System.out.println(
                    "[" + answer[0] + "," + answer[1] + "]"
                );

                return;
            }
        }
    }
}