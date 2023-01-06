public class arrayListSample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums);
        // [10, 20, 30, 40]

        nums.add(1, 50);
        System.out.println(nums);
        // [10, 50, 20, 30, 40]

        nums.remove(2);
        System.out.println(nums);
        // [10, 50, 30, 40]

        System.out.println(nums.get(2));
        // 30
        System.out.println(nums.size());
        // 4
        System.out.println(nums.indexOf(30));
        // 2

        Iterator it = nums.iterator();
        while (it.hasNext()) {
            int value = (int) it.next();
            if (value == 30) {
                it.remove();
            }
            System.out.println(value);
        }
        System.out.println(nums);
        // 10
        // 50
        // 30
        // 40
        // [10, 50, 40]

        for (int value : nums) {
            System.out.println(value);
        }
        // 10
        // 50
        // 40

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        // 10
        // 50
        // 40
    }
}