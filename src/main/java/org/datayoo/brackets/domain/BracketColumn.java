package org.datayoo.brackets.domain;

import org.datayoo.domain.core.PropResource;
import org.datayoo.domain.core.Resource;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BRK_COLUMN",
    indexes = { @Index(name = "IDX_BRK_COLUMN_ID", columnList = "RES_ID"),
    })
@Inheritance(strategy = InheritanceType.JOINED)
public class BracketColumn extends PropResource {

  // 资源序号
  @Column(name = "ORDINAL")
  private int ordinal = 0;

  @ManyToOne
  @JoinColumn(name = "COLSET_ID")
  private BracketColumnSet columnSet;

  @ManyToOne
  @JoinColumn(name = "PARENT_ID")
  private BracketColumn parent;

  @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
  @JoinColumn(name = "PARENT_ID")
  private Set<BracketColumn> children = new HashSet<BracketColumn>();

  public int getOrdinal() {
    return ordinal;
  }

  public void setOrdinal(int ordinal) {
    this.ordinal = ordinal;
  }

  public BracketColumnSet getColumnSet() {
    return columnSet;
  }

  public void setColumnSet(BracketColumnSet columnSet) {
    this.columnSet = columnSet;
  }

  public BracketColumn getParent() {
    return parent;
  }

  public void setParent(BracketColumn parent) {
    this.parent = parent;
  }

  public Set<BracketColumn> getChildren() {
    return children;
  }

  public void setChildren(Set<BracketColumn> children) {
    this.children = children;
  }
}
