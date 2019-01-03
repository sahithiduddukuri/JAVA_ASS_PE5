package com.stackroute;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
public class UpdateElementTest {
    UpdateElement updateElement=new UpdateElement();
    @Test
    public void arrayTest(){
        ArrayList<String> actual= new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));
        ArrayList<String> expected= new ArrayList<String>(Arrays.asList(new String[]{"kiwi", "Grape", "Mango","Berry"}));
        Assert.assertEquals(expected, updateElement.array(actual,"kiwi","Mango"));    }    @Test
    public void update()
    {
        ArrayList<String> actual= new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape", "Melon","Berry"}));
        List<String>expected=new ArrayList<>();
        Assert.assertEquals(expected,updateElement.updateArray(actual));
    }
}