from Product import Product

class Hot_drink(Product):
    def __init__(self, name, price, volume, temperature):
        super().__init__(name, price, volume)
        self._temperature = temperature

    def __str__(self):
        return "{} {} {} {}".format(self._name, self._price, self._volume, self._temperature)

    @property
    def temperature(self):
        return self._temperature
    
    @temperature.setter
    def temperature(self, new_temperature):
        self._temperature = new_temperature