package P14;

public class BinaryTree23 {
    Node23 root;

    public BinaryTree23() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa23 mahasiswa) {
        Node23 newNode = new Node23(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node23 current = root;
            while (true) {
                Node23 parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }

            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node23 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node23 node) {
        if (node != null) {
            node.mahasiswa.tampilInfomasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node23 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInfomasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node23 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInfomasi();
        }
    }

    public Node23 getSuccessor(Node23 del) {
        Node23 successor = del.right;
        Node23 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary Tree Kosong");
            return;
        }
        Node23 parent = root;
        Node23 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Data Tidak Ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node23 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInfomasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }

                }
                successor.left = current.left;
            }
        }
    }
    public void addRekursif(Mahasiswa23 mahasiswa) {
        root = addRekursif(root, mahasiswa);
    }

    private Node23 addRekursif(Node23 current, Mahasiswa23 mahasiswa) {
        if (current == null) {
            return new Node23(mahasiswa);
        }
        
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursif(current.right, mahasiswa);
        }
        
        return current;
    }

    public Mahasiswa23 cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Binary Tree Kosong");
            return null;
        }
        Node23 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.mahasiswa;
    }

    public Mahasiswa23 cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Binary Tree Kosong");
            return null;
        }
        Node23 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.mahasiswa;
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("\n--- Daftar Mahasiswa dengan IPK di atas " + ipkBatas + " ---");
        tampilMahasiswaIPKdiAtas(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiAtas(Node23 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
            
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInfomasi();
            }
            
            tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
        }
    }
}
