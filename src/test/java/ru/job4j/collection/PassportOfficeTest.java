package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestPassportIsDuplicate() {
        Citizen petrarsentev = new Citizen("2f44a", "Petr Arsentev");
        Citizen anastasiiabogomolova = new Citizen("2f44a", "Anastasiia Bogomolova");
        PassportOffice office = new PassportOffice();
        office.add(petrarsentev);
        office.add(anastasiiabogomolova);
        assertThat(office.add(anastasiiabogomolova)).isFalse();
    }
}