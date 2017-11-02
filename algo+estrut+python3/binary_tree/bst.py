"""
Binary Search Tree
"""

### pylint: disable=C0111

class Node:

    def __init__(self, number):
        self.number = number
        self.left = None
        self.right = None

class Tree:

    def __init__(self):
        self.root = None

    def add_node(self, node_new):
        if self.root is None:
            self.root = node_new
            return

        sai = False
        node_parent = self.root

        while sai is False:
            if node_new.number < node_parent.number:
                if node_parent.left is None:
                    node_parent.left = node_new
                    break
                else:
                    node_parent = node_parent.left
            elif node_new.number > node_parent.number:
                if node_parent.right is None:
                    node_parent.right = node_new
                    break
                else:
                    node_parent = node_parent.right

    def show(self):

        print("root: %d" % (self.root.number))
        if hasattr(self.root.left, 'number'):
            print("--> left: %d" % (self.root.left.number))
            if hasattr(self.root.left.left, 'number'):
                print("----> left: %d" % (self.root.left.left.number))
            if hasattr(self.root.left.right, 'number'):
                print("----> right: %d" % (self.root.left.right.number))                
        if hasattr(self.root.right, 'number'):
            print("--> right: %d" % (self.root.right.number))
            if hasattr(self.root.right.left, 'number'):
                print("----> left: %d" % (self.root.right.left.number))
            if hasattr(self.root.right.right, 'number'):
                print("----> right: %d" % (self.root.right.right.number))                


def main():
    tree = Tree()
    tree.add_node(Node(10))
    tree.add_node(Node(5))
    tree.add_node(Node(15))
    tree.add_node(Node(3))
    tree.add_node(Node(7))
    tree.add_node(Node(13))
    tree.add_node(Node(17))    
    tree.show()

if __name__ == '__main__':
    main()
