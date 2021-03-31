package org.datayoo.brackets.domain;

import org.datayoo.domain.core.Resource;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "BRK_COLUMN_SET",
    indexes = { @Index(name = "IDX_BRK_COLSET_ID", columnList = "RES_ID"),
    })
@Inheritance(strategy = InheritanceType.JOINED)
public class BracketColumnSet extends Resource {

  @OneToMany(mappedBy = "columnSet")
  protected Set<BracketColumn> columns = new HashSet<>();

  public Set<BracketColumn> getColumns() {
    return columns;
  }

  public void setColumns(Set<BracketColumn> columns) {
    this.columns = columns;
  }
}
