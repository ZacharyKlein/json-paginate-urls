package com.example

class BootStrap {

    def init = { servletContext ->

        def product1 = new Product(name: 'Cargo Pants', description: 'CLOTH001', price: 15.00)
        def product2 = new Product(name: 'Sweater', description: 'CLOTH002', price: 12.00)
        def product3 = new Product(name: 'Jeans', description: 'CLOTH003', price: 15.00)
        def product4 = new Product(name: 'Blouse', description: 'CLOTH004', price: 18.00)
        def product5 = new Product(name: 'T-Shirt', description: 'CLOTH005', price: 10.00)
        def product6 = new Product(name: 'T-Shirt', description: 'CLOTH005', price: 10.00)

        def product7 = new Product(name: 'Bookcase', description: 'FURN001', price: 40.00)
        def product8 = new Product(name: 'Coffee Table', description: 'FURN002', price: 50.00)
        def product9 = new Product(name: 'Vanity', description: 'FURN003', price: 90.00)

        def product10 = new Product(name: 'Table Saw', description: 'TOOL001', price: 120.00)
        def product11 = new Product(name: 'Router', description: 'TOOL002', price: 90.00)
        def product12 = new Product(name: 'Block Plane', description: 'TOOL003', price: 50.00)
        def product13 = new Product(name: 'Chisel', description: 'TOOL004', price: 22.00)

        [product1, product2, product3, product4, product5, product6, product7,
         product8, product9, product10, product11, product12, product13]*.save()



    }
    def destroy = {
    }
}
