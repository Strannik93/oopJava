class Product():
    def __init__(self, name, price, volume):
        self._name = name
        self._price = price
        self._volume = volume

    def __str__(self):
        return "{} {} {}".format(self._name, self._price, self._volume)

    @property
    def name(self):
        return self._name
    
    @name.setter
    def name(self, new_name):
        self._name = new_name

    @property
    def price(self):
        return self._price
    
    @price.setter
    def price(self, new_price):
        self._price = new_price

    @property
    def volume(self):
        return self._volume
    
    @volume.setter
    def volume(self, new_volume):
        self._volume = new_volume