package es.esy.tipeyizanpam.makeinteractivelistview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentainMenu extends Fragment {


    public FragmentainMenu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_fragmentain_menu, container, false);
        String[] myList ={
                "1- Haiti", "2- Jamaique", "3- Panama", "4- Saint Domingue",
                "5- Porto Rico", "6- Bahamas", "7- Saint Martin", "8- Guadeloupe",
                "9- Grenade", "10- Cuba"
        };

        ListView listView = (ListView) view.findViewById(R.id.listView);
        //ArrayAdapters
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                myList
        );
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
        @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if(position==0){
                    Toast.makeText(getActivity(), "Position"+position+".", Toast.LENGTH_SHORT).show();
                }else if(position==1){
                    Toast.makeText(getActivity(), "Position"+position+".", Toast.LENGTH_SHORT).show();
                }else if(position==2){
                    Toast.makeText(getActivity(), "Position"+position+".", Toast.LENGTH_SHORT).show();
                }else if(position==3){
                    Toast.makeText(getActivity(), "Position"+position+".", Toast.LENGTH_SHORT).show();
                }else if(position==4){
                    Toast.makeText(getActivity(), "Position"+position+".", Toast.LENGTH_SHORT).show();
                }else if(position==5){
                    Toast.makeText(getActivity(), "Position"+position+".", Toast.LENGTH_SHORT).show();
                }else if(position==6){
                    Toast.makeText(getActivity(), "Position"+position+".", Toast.LENGTH_SHORT).show();
                }else if(position==7){
                    Toast.makeText(getActivity(), "Position"+position+".", Toast.LENGTH_SHORT).show();
                }else if(position==8){
                    Toast.makeText(getActivity(), "Position"+position+".", Toast.LENGTH_SHORT).show();
                }else if(position==9){
                    Toast.makeText(getActivity(), "Position"+position+".", Toast.LENGTH_SHORT).show();
                }
        }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
