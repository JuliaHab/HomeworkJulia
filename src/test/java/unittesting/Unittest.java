package unittesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium1.Tickets;

public class Unittest {

    // юниттест папки tickets
    @Test
    public void tickets_infant_freeTicket(){  // проверяем первое условие (детей до 2 лет)

    // Given - Arrange - Preconditions

        Tickets infant = new Tickets(1,1000);

    // When - Act - Testing
        double result = infant.calculate();

    // Then - Assert - Compare expected and actual results
        Assert.assertEquals(result,0.0, "Erroring");  // статическая функция, последнее в ковычках указывается для того чтобы оно высвечивалось если тест упал
    }

    @Test
    public void tickets_child_50precent(){  // проверяем второе условие (детей до 13 лет)

        Tickets child = new Tickets(10,1000);
        double result = child.calculate();
        Assert.assertEquals(result,500.0, "Error - Assert failed for child Ticket");
    }

    @Test
    public void tickets_adult_fullPrice(){  // проверяем четвертое условие (людей до 65 лет)

        Tickets adult = new Tickets(45,1000);
        double result = adult.calculate();
        Assert.assertEquals(result,1000.0, "Error - Assert failed for adult Ticket");
    }

    @Test
    public void tickets_senior_20precent(){  // проверяем третье условие (людей от 66 лет)

        Tickets senior = new Tickets(67,1000);
        double result = senior.calculate();
        Assert.assertEquals(result,800.0, "Error - Assert failed for senior Ticket");
    }
}
