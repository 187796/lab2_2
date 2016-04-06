package pl.com.bottega.ecommerce.sharedkernel;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testSubtractWithPositiveNumber() {
		Money firstMoney = new Money(100);
		Money secondMoney = new Money(50);

		Money result = firstMoney.subtract(secondMoney);
		assertThat(result.toString(), is("50,00 " + Money.DEFAULT_CURRENCY));
	}

	@Test
	public void testSubtractWithNegativeNumber() {
		Money firstMoney = new Money(100);
		Money secondMoney = new Money(-50);

		Money result = firstMoney.subtract(secondMoney);
		assertThat(result.toString(), is("150,00 " + Money.DEFAULT_CURRENCY));
	}

	@Test
	public void testSubtractWithZeroNumber() {
		Money firstMoney = new Money(100);
		Money secondMoney = new Money(0);

		Money result = firstMoney.subtract(secondMoney);
		assertThat(result.toString(), is("100,00 " + Money.DEFAULT_CURRENCY));
	}

	@Test
	public void testAddWithPositiveNumber() {
		Money firstMoney = new Money(100);
		Money secondMoney = new Money(50);

		Money result = firstMoney.add(secondMoney);
		assertThat(result.toString(), is("150,00 " + Money.DEFAULT_CURRENCY));
	}

	@Test
	public void testAddWithNegativeNumber() {
		Money firstMoney = new Money(100);
		Money secondMoney = new Money(-99);

		Money result = firstMoney.add(secondMoney);
		assertThat(result.toString(), is("1,00 " + Money.DEFAULT_CURRENCY));
	}

	@Test
	public void testAddWithZeroNumber() {
		Money firstMoney = new Money(100);
		Money secondMoney = new Money(0);

		Money result = firstMoney.add(secondMoney);
		assertThat(result.toString(), is("100,00 " + Money.DEFAULT_CURRENCY));
	}

	@Test
	public void testMultiplyByWithPositiveNumber() {
		Money money = new Money(100);
		double multiplier = 5;

		Money result = money.multiplyBy(multiplier);
		assertThat(result.toString(), is("500,00 " + Money.DEFAULT_CURRENCY));
	}

	@Test
	public void testMultiplyByWithNegativeNumber() {
		Money money = new Money(100);
		double multiplier = -5;

		Money result = money.multiplyBy(multiplier);
		assertThat(result.toString(), is("-500,00 " + Money.DEFAULT_CURRENCY));
	}

	@Test
	public void testMultiplyByWithZeroNumber() {
		Money money = new Money(100);
		double multiplier = 0;

		Money result = money.multiplyBy(multiplier);
		assertThat(result.toString(), is("0,00 " + Money.DEFAULT_CURRENCY));
	}
}
