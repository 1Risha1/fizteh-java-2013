package ru.fizteh.fivt.storage.strings;

/**
 * ������������ ��������� ��� �������� ����������� {@link TableProviderFactory}. ��������������, ��� ���������� ����������
 * ������� ����� ����� ��������� ����������� ��� ����������.
 *
 * @author Fedor Lavrentyev
 * @author Dmitriy Komanov
 */
public interface TableProviderFactory {

    /**
     * ���������� ������ ��� ������ � ����� ������.
     *
     * @param dir ���������� � ������� ���� ������.
     * @return ������ ��� ������ � ����� ������.
     * @throws IllegalArgumentException ���� �������� ���������� null ��� ����� ������������ ��������.
     */
    TableProvider create(String dir);
}