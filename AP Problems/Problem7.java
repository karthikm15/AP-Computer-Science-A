1) a)

public int compareCustomer(Customer other) {
    if (this.getName().equals(other.getName()) {
        return this.getID() - other.getID();
    } else {
        return this.getName().compareTo(other.getName());
    } 
}

b)
public Customer[] prefixMerge (Customer[] list1, Customer[] list2, Customer[] list3) {
    Customer[] newArr = new Customer[list1.length + list2.length];
    int counter = 0;
    
    for (int i = 0; i < list1.length; i++) {
        newArr[counter] = list1[i];
        counter++;
    }
    for (int i = 0; i < list2.length; i++) {
        newArr[counter] = list2[i];
        counter++;
    }
    
    for (int i = 0; i < newArr.length; i++) {
        for (int j = 0; j < newArr.length-1; j++) {
            if (newArr[j].compareCustomer(newArr[j+1]) > 0) {
                Customer temp = newArr[j];
                newArr[j] = newArr[j+1];
                newArr[j+1] = temp;
            }
        }
    }
    
    for (int i = 0; i < list3.length; i++) {
        list3[i] = newArr[i];
    }
    
    return list3;
}
