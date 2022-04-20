package tugas;
/**
 *
 * @author nares
 */
public class belanja {
    int size;
    int top;
    strukBelanja data[];
    
        public belanja(int size){
        this.size = size;
        data = new strukBelanja[size];
        top = -1;
        }

        public boolean IsEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

        public boolean IsFull(){
        if(top == size - 1){
            return true;
        }else{
            return false;
        }
    }

        public void push(strukBelanja sb){
        if(!IsFull()){
            top++;
            data[top] = sb;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }

        public void pop(){
        if(!IsEmpty()){
            strukBelanja x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.noTransaksi + " " + x.tanggal + " " + x.nmBarang + " " + x.jumlah + " " + x.total);
        }else{
            System.out.println("Stock masih kosong");
        }
    }

        public void peek(){
        System.out.println("Elemen teratas: " + data[top].noTransaksi +"."+ " " + data[top].tanggal + " " + data[top].nmBarang + " " + data[top].jumlah + " " + data[top].total);
    }

        public void print(){
        System.out.println("Isi stack: ");
        for(int i = top; i >= 0; i--){
        System.out.println(data[i].noTransaksi + " " + data[i].tanggal + " " + data[i].nmBarang + " " + data[i].jumlah + " " + data[i].total);
    }
        System.out.println("");
    }
        public void clear(){
            if(!IsEmpty()){
            for(int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stock sudah dikosongkan");
            }else{
            System.out.println("Stock masih kosong");
        }
    }
}

