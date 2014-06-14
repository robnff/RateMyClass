package com.example.ratemyclass;
/*
import org.achartengine.model.XYMultipleSeriesDataset;
import org.achartengine.model.XYSeries;
*/
import com.jjoe64.graphview.BarGraphView;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GraphViewSeries;
import com.jjoe64.graphview.GraphView.GraphViewData;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;

public class Professor_chart extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle extras = getIntent().getExtras();
		String[] answers = extras.getStringArray("respostas");
		
		GraphViewSeries testando = new GraphViewSeries(new GraphViewData[]{
			new GraphViewData(1, 2.0d),
			new GraphViewData(2, 4.0d),
			new GraphViewData(3, 6.0d),
			new GraphViewData(4, 8.0d),
			new GraphViewData(5, 10.0d),
		});
		GraphView exemplo = new BarGraphView(this, "respostas da pergunta 1");
		exemplo.addSeries(testando);
		LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
		layout.addView(exemplo);
		setContentView(R.layout.activity_professor_chart);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.professor_chart, menu);
		return true;
	}

}
