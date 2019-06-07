
package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;

public class IndependentMessageRenderer {
   //��������� ��� ��������� Spring ������� � ���������� ��� � ���������� �����������
   @Autowired  //��������������
    private MessageRenderer renderer;

    public void print() {
        renderer.printMessage();
    }
}
