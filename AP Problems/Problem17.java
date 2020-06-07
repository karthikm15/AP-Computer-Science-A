public int getTotalBoxes(){
    int sum = 0;
    for (CookieOrder order: orders)
        sum += order.getNumBoxes();
    return sum;
}

b)

public int removeVariety(String cookieVar){
    int count = 0;
    for (int i = 0; i < orders.size(); i++){
        if (orders.get(i).getVariety() == cookieVar){
            count++;
            orders.remove(i);
            i--;
        }
    }
    return count;
}
