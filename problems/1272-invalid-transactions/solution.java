class Solution {
    public List<String> invalidTransactions(String[] transactions) {

        List<String> result = new ArrayList<>();
        for (int i = 0; i < transactions.length; i++){

            String[] trans1 = transactions[i].split(",");
            int currAmt = Integer.parseInt(trans1[2]);
            boolean invalid = false;

        
            if (currAmt > 1000){
                invalid = true;
            }

            for (int j = 0; j < transactions.length; j++){
                if (i != j){
                    String[] trans2 = transactions[j].split(",");
                    if (trans1[0].equals(trans2[0]) && !(trans1[3].equals(trans2[3])) && Math.abs(Integer.parseInt(trans1[1]) - Integer.parseInt(trans2[1])) <= 60){
                        invalid = true;
                        break;
                    }
                }
            }

            if (invalid){
                result.add(transactions[i]);
            }
        }
        return result;
        
    }
}
