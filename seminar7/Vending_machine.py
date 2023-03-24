class Vending_machine():
    def __init__(self):
        self._my_list = []

    def add(self, product):
        self._my_list.append(product)
    
    def remove(self, name):
        for item in self._my_list:
            if item._name == name:
                self._my_list.remove(item)
    
    def get_product(self, name):
        for item in self._my_list:
            name_product = item._name
            if name.lower() in name_product.lower():
                print(item)

    def print_products(self):
        for item in self._my_list:
            print(item)