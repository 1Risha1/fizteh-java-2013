package ru.fizteh.fivt.storage.strings;

/**
 * @author Fedor Lavrentyev
 * @author Dmitriy Komanov
 */
public interface Table {

    /**
     * ���������� �������� ���� ������.
     */
    String getName();

    /**
     * �������� �������� �� ���������� �����.
     *
     * @param key ����.
     * @return ��������. ���� �� �������, ���������� null.
     *
     * @throws IllegalArgumentException ���� �������� ��������� key �������� null.
     */
    String get(String key);

    /**
     * ������������� �������� �� ���������� �����.
     *
     * @param key ����.
     * @param value ��������.
     * @return ��������, ������� ���� �������� �� ����� ����� �����. ���� ����� �������� �� ���� ��������,
     * ���������� null.
     *
     * @throws IllegalArgumentException ���� �������� ���������� key ��� value �������� null.
     */
    String put(String key, String value);

    /**
     * ������� �������� �� ���������� �����.
     *
     * @param key ����.
     * @return ��������. ���� �� �������, ���������� null.
     *
     * @throws IllegalArgumentException ���� �������� ��������� key �������� null.
     */
    String remove(String key);

    /**
     * ���������� ���������� ������ � �������.
     *
     * @return ���������� ������ � �������.
     */
    int size();

    /**
     * ��������� �������� ���������.
     *
     * @return ���������� ���������� ������.
     */
    int commit();

    /**
     * ��������� ����� ��������� � ������� ��������� ��������.
     *
     * @return ���������� ��������� ������.
     */
    int rollback();
}