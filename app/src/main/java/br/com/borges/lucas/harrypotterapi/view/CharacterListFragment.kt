package br.com.borges.lucas.harrypotterapi.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.borges.lucas.harrypotterapi.R
import br.com.borges.lucas.harrypotterapi.view.adapter.CharacterAdapter

class CharacterListFragment : Fragment() {

  private val mAdapter = CharacterAdapter()

  override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, s: Bundle? ): View {
    val root = inflater.inflate( R.layout.fragment_character_list, container, false )

    val recycler = root.findViewById<RecyclerView>( R.id.recycler_character_list )
    recycler.layoutManager = LinearLayoutManager( context )
    recycler.adapter = mAdapter


    return root
  }
}