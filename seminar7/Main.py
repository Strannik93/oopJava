from Vending_machine import Vending_machine
from Hot_drink import Hot_drink

vm = Vending_machine()
print('Вывод всего списка: ')
vm.add(Hot_drink('espresso', 67, 64, 65))
vm.add(Hot_drink('latte', 42, 45, 70))
vm.print_products()
print('Результаты поиска по "eS": ')
vm.get_product('eS')
print('Вывод всего списка после удаления по "espresso": ')
vm.remove('espresso')
vm.print_products()