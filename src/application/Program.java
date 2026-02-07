package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main (String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Department department = new Department(2, null);

      Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, department);
      sellerDao.insert(newSeller);
        System.out.println("Inserted! New Id = " + newSeller.getId());
    }
}
