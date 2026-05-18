void main(){
        String a = "Salam men hemid";
        Map<Character, Integer> d = new HashMap<>();
        List<Character> keys = new ArrayList<>();
        
        for (char i : a.toCharArray()) {
            if (i != ' ') {
                d.put(i, d.getOrDefault(i, 0) + 1);
            }
        }
        

        keys.addAll(d.keySet());
        
        for (int i = 0; i < keys.size(); i++) {
            for (int j = i + 1; j < keys.size(); j++) {
                char keyI = keys.get(i);
                char keyJ = keys.get(j);
                if (d.get(keyI) > d.get(keyJ)) {
                    keys.set(i, keyJ);
                    keys.set(j, keyI);
                } else if (d.get(keyI).equals(d.get(keyJ))) {
                    if (keyI > keyJ) {
                        keys.set(i, keyJ);
                        keys.set(j, keyI);
                    }
                }
            }
        }
        
        Map<Character, Integer> new_d = new LinkedHashMap<>();
        for (char k : keys) {
            new_d.put(k, d.get(k));
        }
        
        System.out.println(new_d);
        
        StringBuilder c = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : new_d.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                c.append(entry.getKey());
            }
        }
        
        IO.print(c.toString());
    }