package com.cdk.gist;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

import com.cdk.IdeaS.InputModel;
import com.cdk.IdeaS.VersionComparator;

import junit.framework.Assert;

@RunWith(JUnit4ClassRunner.class)
public class VersionComparatotTest {

	@SuppressWarnings("deprecation")
	@Test
	public void testCompare(){
		InputModel model1=new InputModel();
		model1.setVersionNo("12.04");

		InputModel model2=new InputModel();
		model2.setVersionNo("11.04");
		VersionComparator versionComparator=new VersionComparator();
		Assert.assertTrue(versionComparator.compare(model1, model2)>=1);
		model2.setVersionNo("12.04");
		Assert.assertTrue(versionComparator.compare(model1, model2)==0);
		model2.setVersionNo("13.04");
		Assert.assertTrue(versionComparator.compare(model1, model2)<=1);
		
		
	}
}
