package P14;

public class BinaryTreeMain23 {
    public class BinaryTreeArrayMain00 {
    public static void main(String[] args) {
        BinaryTreeArray23 bta = new BinaryTreeArray23();
        
        Mahasiswa23 mhs1 = new Mahasiswa23("244160121", "Ali", "A", 3.57);
        Mahasiswa23 mhs2 = new Mahasiswa23("244160185", "Candra", "C", 3.41);
        Mahasiswa23 mhs3 = new Mahasiswa23("244160221", "Badar", "B", 3.75);
        Mahasiswa23 mhs4 = new Mahasiswa23("244160220", "Dewi", "B", 3.35);
        Mahasiswa23 mhs5 = new Mahasiswa23("244160131", "Devi", "A", 3.48);
        Mahasiswa23 mhs6 = new Mahasiswa23("244160205", "Ehsan", "D", 3.61);
        Mahasiswa23 mhs7 = new Mahasiswa23("244160170", "Fizi", "B", 3.86);
        
        Mahasiswa23[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        
        bta.populateData(dataMahasiswas, idxLast);
        
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}
    public static void main(String[] args) {
        BinaryTree23 bst = new BinaryTree23();
        bst.add(new Mahasiswa23("244160121","Ali","A",3.57));
        bst.add(new Mahasiswa23("244160221","Badar","B",3.85));
        bst.add(new Mahasiswa23("244160185","Candra","C",3.21));
        bst.add(new Mahasiswa23("244160220","Dewi","B",3.54));

        System.out.println("\nDaftar Semua Mahasiswa (in order traversal): ");
        bst.traverseInOrder((bst.root));

        System.out.println("\nPencarian data mahasiswa: ");
        System.out.println("Cari mahasiswa dengan ipk:3.54");
        String hasilCari = bst.find(3.54)? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa23("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa23("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa23("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal" );
        bst.traverseInOrder(bst.root);

        System.out.println("\nPreorder Traversal:");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);
        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
    }
}
